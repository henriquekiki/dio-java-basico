public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual ?" + smartTv.canal);
        System.out.println("Volume Atual ?" + smartTv.volume);

        smartTv.mudarCanal(27);
        System.out.println("Canal Atual ?" + smartTv.canal);

        //smartTv.aumentarVolume();
       //System.out.println("Volume Atual ?" + smartTv.volume);

       //smartTv.diminuirVolume();
       //smartTv.diminuirVolume();
       //System.out.println("Volume Atual ?" + smartTv.volume);

       //smartTv.aumentarCanal();
       //System.out.println("Canal Atual ?" + smartTv.canal);

        //smartTv.diminuirCanal();
        //System.out.println("Canal Atual ?" + smartTv.canal);
        
        //smartTv.ligar ();
        //System.out.println("Novo status -> TV Ligada ?" + smartTv.ligada);
        
        //smartTv.desligar ();
        //System.out.println("Novo status -> TV Ligada ?" + smartTv.ligada);


    }
}
