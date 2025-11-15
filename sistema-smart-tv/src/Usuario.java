public class Usuario {
    public static void main(String[] args) throws Exception {
        // instancia do objeto
        SmartTv smartTv = new SmartTv ();

        // imprimir o estado atual da tv

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(13);
        
        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Volume Atual : " + smartTv.volume);

        System.out.println("TV Ligada? " + smartTv.ligada);
        
        

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);
    
     
    
    }
}
