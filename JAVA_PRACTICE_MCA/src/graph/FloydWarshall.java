package graph;

public class FloydWarshall {

    int a[][];

    FloydWarshall(int a[][]){
        this.a = a;
    }

    public void display(){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void calc(){

        display();

        System.out.println();

        for(int k = 0; k < a.length; k++){
            for(int i = 0; i < a.length; i++){
                for(int j = 0; j < a.length; j++){
                    a[i][j] = Math.min(a[i][j], a[i][k] + a[k][j]);
                }
            }
        }

        display();

    }




}
