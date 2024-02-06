package tombnelkul;

import java.util.Scanner;

public class ElemiProgTetelek {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    
    /* Python kód*/    
    
    /*def tetel():
    n = int(input("N="))
    while n < 0:
        n = int(input("N="))
    ossz = 0
    for i in range(n+1):
        ossz += i
    print(f"Az első {n} db természetes szám összege: {ossz}")*/
    
    /*Java kód*/
    
    int n = -1;
    while (n < 1){
    //bekérés
        System.out.print("N=");
        n = sc.nextInt();
    /*n = int(input("N= "))*/
    }
    int ossz = 0;
    for (int i = 0; i < n+1; i++) {
        ossz += i;
    }
    System.out.printf("Az első %d szám összege: %d\n",n,ossz);
    
    

    int db = 0;
    for (int i = 10; i <= 99; i++){
        if (i % 2 == 0){
        db++;
        }
    }
    System.out.printf("Kétjegyű páros számok mennyisége: %d\n",db);
    
    int vege = 0;
    int szam = 1;
    db = 0;
    int min = Integer.MAX_VALUE;
    while(szam!= vege){
        System.out.print("N=");
        szam = sc.nextInt();
        if (szam < min){
            min = szam;}
        db++;
    }
        System.out.printf("%d számból a legkisebb: %d",(db-1),min);      
    }
}
