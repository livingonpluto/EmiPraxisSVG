public class stern5 {
    public static void main(String[] args){
        //gewuenschte position
        int StartpunktX= 1870;   //0-1920
        int StartpunktY= 188;   //0-1080
        //gewuenschte Anzahl Ecken
        int EckenAnzahl = 5;     //5, 8, 10, 15, 18 und 30
        //groesse des Sterns
        double radiusSternAussen = 60;
        double radiusSternInnen = radiusSternAussen/2;
        //Dauer
        int dur =5;


        //Winkel fuer die Rotation
        double winkel = 2*Math.PI/EckenAnzahl;

        double ZackeAussenX = radiusSternAussen+StartpunktX;
        double ZackeAussenY = StartpunktY;
        double ZackeInnenX;
        double ZackeInnenY;
        System.out.println("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"100\" height=\"100%\">");
        System.out.println("<polygon id=\"star"+EckenAnzahl+"\"");
        System.out.println("points=\" ");
        for(int i=0; i<EckenAnzahl; i++){
            System.out.println(ZackeAussenX+","+ZackeAussenY+" ");
            ZackeAussenX = StartpunktX + Math.round(radiusSternAussen*Math.cos((i+1)*winkel));
            ZackeAussenY =StartpunktY+ Math.round(radiusSternAussen*Math.sin((i+1)*winkel));

            ZackeInnenX =StartpunktX+ Math.round(radiusSternInnen*Math.cos((i)*winkel+(winkel*0.5)));
            ZackeInnenY = StartpunktY +Math.round(radiusSternInnen*Math.sin((i)*winkel+(winkel*0.5)));
            System.out.println(ZackeInnenX+","+ZackeInnenY+" ");
        }
        System.out.println("\"    fill=\"#ffd700\">");
        System.out.println("<animateTransform attributeName=\"transform\" type=\"rotate\"");
        System.out.println("from=\"0"+ " " +StartpunktX +" "+StartpunktY+"\"");
        System.out.println("to=\"360"+" "+StartpunktX +" "+StartpunktY+"\"");
        System.out.println("dur=\""+dur+"s"+"\" repeatCount=\"indefinite\"/>");
        System.out.println("</polygon>");
        System.out.println("</svg>");
    }
}
