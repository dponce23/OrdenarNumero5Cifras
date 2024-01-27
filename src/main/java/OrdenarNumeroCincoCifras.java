public class OrdenarNumeroCincoCifras {
    private int numero;
    public OrdenarNumeroCincoCifras(int num){
        this.numero=num;
    }

    public int[] separarNumeros(){
        int[] arrayNumerosSeparados=new int[5];
        for (int i=0; i<5; i++){
            arrayNumerosSeparados[i]=this.numero%10;
            this.numero=this.numero/10;
        }
        return arrayNumerosSeparados;
    }

    public int[] ordenarNumeros(){
        int[] separados=separarNumeros();
        for (int i=0;i<separados.length;i++){
            for (int j=i+1;j<separados.length;j++){
                int aux=0;
                if (separados[i]>separados[j]){
                    aux=separados[i];
                    separados[i]=separados[j];
                    separados[j]=aux;
                }
            }
        }
        return separados;
    }
}
