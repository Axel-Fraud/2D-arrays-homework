class Main {
  public static void main(String[] args) {
        int[][] x = new int[5][7];
        for(int i = 0; i < x.length;i++){
            for(int j = 0; j < x[0].length; j++){
                x[i][j] = (int)(Math.random() * 100);
            }
        }
  System.out.println(addUp(x));
        
  System.out.println(smallEst(x));
    }
public static int addUp(int[][] x){
int sum = 0;
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[0].length; j++){
                sum += x[i][j]; 
            }
        }
        return sum;
}

public static int smallEst(int[][] x){

int min = x[0][0]; 
for(int i = 0; i < x.length; i++){
    for(int j = 0; j < x[0].length; j++){
        if (x[i][j] < min) { 
            min = x[i][j]; 
        }
    }
}
return min;

}

  }