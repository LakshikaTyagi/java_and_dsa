public class ModuloProperties {
    static void main() {
        int a = 50 , b = 5 , m = 4;
        System.out.printf("a = %d , b = %d , m = %d\n",a,b,m);

//        (a+b)%m = [(a%m)+(b%m)]%m
        System.out.printf("(a+b)%%m = %d , ((a%%m)+(b%%m))%%m = %d\n",(a+b)%m,((a%m)+(b%m))%m);

//        (a-b)%m = [(a%m)-(b%m)]%m
        System.out.printf("(a-b)%%m = %d , ((a%%m)-(b%%m))%%m = %d\n",(a-b)%m,((a%m)-(b%m))%m);

//        (a*b)%m = [(a%m)*(b%m)]%m
        System.out.printf("(a*b)%%m = %d , ((a%%m)*(b%%m))%%m = %d\n",(a*b)%m,((a%m)*(b%m))%m);

//        (a/b)%m = [(a%m)*(b^(-1)%m)]%m

//        (a%m)%m = a%m
        System.out.printf("(a%%m)%%m = %d , a%%m = %d\n",(a%m)%m,a%m);

//        m^(x)%m = 0;
        System.out.printf("m^(x)%%m = %d\n",Math.powExact(m,2)%m);
    }
}
