import java.util.Arrays;
import java.util.Collections;

public class ChocolateCut {
    public static void main(String agrs[]){
        int n=4;
        int m=6;
        Integer costVer[] =  {2,1,3,1,4};
        Integer costHor[] = {4,1,2};

        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int h = 0; //on which horizonatal cost
        int v = 0; //on which vertical cost
        int hp = 1; // horizontal peices
        int vp = 1; //vertical peices
        int cost = 0;
        while(v<costHor.length && v<costVer.length){
            //vertical cost < horizontal cost
            if(costVer[v] <= costHor[h]){ //horizontal cut
                cost  += (costHor[h]*vp);
                    hp++;
                    h++;
            }
            else //vertical cuts
             {
                    cost += (costVer[v]*hp);
                    vp++;
                    v++;
            }
        }

        while(h<costHor.length){
            cost+= (costHor[h]*vp);
            hp++;
            h++;
        }

        while(v<costVer.length){
            cost += (costVer[v]*hp);
            vp++;
            v++;
        }

        System.out.println("Minimum cost of cuts =  "+cost);
    }   
}
