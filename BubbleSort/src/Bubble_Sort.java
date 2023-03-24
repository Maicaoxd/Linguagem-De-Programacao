// BUBBLE SORT
public class Bubble_Sort {
    public static void main(String[] args){
        int j, i, aux;
        int vt[] = {26, 47, 38, 11, 25};
        for (i=0;i<5;i++){
            for(j=0;j<=i;j++){
                if (vt[i] <= vt[j]){
                    aux = vt[i];
                    vt[i] = vt[j];
                    vt[j] = aux;
                }
            }
        }
        for (i=0;i<5;i++){
            System.out.print(+vt[i]+" ,");
        }
    }
}
