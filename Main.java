import java.util.Scanner;
public class ChessGod {
    public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      
        int v[ ] [ ];
        v = new int [8] [8];
        //1-t, 2-c, 3-a, 4-D, 5-R, 6-p
        
        //Establecer piezas blancas
        v[0][0]=1;
        v[0][1]=2;
        v[0][2]=3;
        v[0][3]=4;
        v[0][4]=5;
        v[0][5]=3;
        v[0][6]=2;
        v[0][7]=1;
        
        for (int i=0; i<8; i++){
      	   	v[1][i]=6;}
      	   	
      	   	
      	//Establecer piezas negras
        for (int i=0; i<8; i++){
      	   	v[6][i]=6;}
      	   	
      	v[7][0]=1;
        v[7][1]=2;
        v[7][2]=3;
        v[7][3]=4;
        v[7][4]=5;
        v[7][5]=3;
        v[7][6]=2;
        v[7][7]=1;

      	
      	//Establecer espacio entre las piezas
        for (int i=0; i<v.length; i++){
    	    for (int c=0; c<v[0].length; c++){
    	        System.out.print(v[i][c]+" ");}
            System.out.println();
        }
        
        
        //posición letras (columnas)
        int c=0;
        int x=0;
        //posición cifras (filas)
        int f=0;
        int y=0;
        //numero de la pregunta (estético)
        int J=1;
        //valor para el bucle
        int b=0;
        
        /*
        while(b<5){
            
            J=1;
            System.out.println(J+"- Elige la posición la pieza que quieres mover (primero columna y segundo filas): ");
            c= sc.nextInt();
            f= sc.nextInt();
            
            J=2;
            System.out.println(J+"- Elige la posición de colocacion de la pieza (primero columna y segundo filas): ");
            x= sc.nextInt();
            y= sc.nextInt();
            
            //1-t, 2-c, 3-a, 4-D, 5-R, 6-p
            
            if (x<8 && y<8 && x>=0 && y>=0 && c<8 && f<8 && c>=0 && f>=0){}
                else if (v[c][f]==1){
                    //if{}
                }
                else if (v[c][f]==2){}
                else if (v[c][f]==3){}
                else if (v[c][f]==4){}
                else if (v[c][f]==5){}
                else if (v[c][f]==6){}
            
            else{System.out.println("Has introducido mal una posicion");}
            
            if (x<5 && y<5 && x>=0 && y>=0){
                if (v[x][y]==0){  
                    v[x][y]=1;
                    b++;}
                else {System.out.println("Ya hay un barco en esta posición");}}
            else{
            System.out.println("Error: limite de 5 filas y columnas");}

    }*/
}
}
