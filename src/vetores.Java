public class vetores{
    public static void main(String[] args){
        int n[] = {3,2,8,7,5,4};
        System.out.println(n[3]+ n[4]);
        int a = n[0]+n[5];
        System.out.println(a);

        System.out.println("casas do vetor" + n.legth);
        
        int q = 0; // posição!
        while(q <10){
            System.out.print(n[q] + " ");
            q = q +1;
        }

        int b = 0;
        while(b <= n.length){
            System.out.print(n[b] + " ");
            b = b + 1;
        }
    }
}