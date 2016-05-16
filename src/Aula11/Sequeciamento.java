package Aula11;
public class Sequeciamento {
    public static void main(String[] args) {
        char dna[]= {'a','t','g','c','a','t','g','c'};
        for(int i=0; i<dna.length;i++){
            System.out.print(dna[i]);
        }
        ordem(dna);
        System.out.println();
        for(int i=0; i<dna.length;i++){
            System.out.print(dna[i]);
        }
    }
    public static void ordem(char vet[]){
        for (int i=0;i<vet.length;i++){
            if(vet[i]=='a'){
                vet[i]=compa(vet[i+2],vet[i+3]);
        }
    }
    }
    public static char compa(char gen, char gen2){
        if((gen=='g')&&(gen2=='c')){
            return 't';
        }
        if((gen=='t')||(gen2=='c')){
            return 'a';
        }
        return gen;
    }
}
