public class Covid19Data {
    String region;
    String aldersGruppe;
    int bekræftedeTilfælde;
    int døde;
    int indlagtePåIntensiv;
    int indlagte;
    String dato;

    public Covid19Data(String region, String aldersGruppe, int bekræftedeTilfælde,
                       int døde, int indlagtePåIntensiv, int indlagte, String dato){
        this.region = region;
        this.aldersGruppe = aldersGruppe;
        this.bekræftedeTilfælde = bekræftedeTilfælde;
        this.døde = døde;
        this.indlagtePåIntensiv = indlagtePåIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    @Override
    public String toString(){
        return "region: " + region + " aldersgruppe: " + aldersGruppe + " bekræftede tildfælde: " + bekræftedeTilfælde +
        " døde: " + døde + " indlagte på intensiv: " + indlagtePåIntensiv + " indlagte: " + indlagte + " dato: " + dato;
    }
}
