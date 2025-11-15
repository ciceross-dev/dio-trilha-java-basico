public class SmartTv{
    //atributos
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //criando os métodos que mudam o estado da TV

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void mudarCanal( int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
       System.out.println("Aumentar o volume para: " + volume);   
    }

    public void diminuirVolume(){
        //volume = volume - 1;
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }



}