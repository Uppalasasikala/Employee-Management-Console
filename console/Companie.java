package com.sj.empmanagmentapplication;

public class Companie {

    private String denumire;
    private Integer vechime;
    private Double cifraAfaceri;
    private Integer numarAngajati;
    //Departament


    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Integer getVechime() {
        return vechime;
    }

    public void setVechime(Integer vechime) {
        this.vechime = vechime;
    }

    public Double getCifraAfaceri() {
        return cifraAfaceri;
    }

    public void setCifraAfaceri(Double cifraAfaceri) {
        this.cifraAfaceri = cifraAfaceri;
    }

    public Integer getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(Integer numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public Companie(String denumire, Integer vechime, Double cifraAfaceri, Integer numarAngajati) {
        this.denumire = denumire;
        this.vechime = vechime;
        this.cifraAfaceri = cifraAfaceri;
        this.numarAngajati = numarAngajati;
    }

    @Override
    public String toString() {
        return "Companie{" +
                "denumire='" + denumire + '\'' +
                ", vechime=" + vechime +
                ", cifraAfaceri=" + cifraAfaceri +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}
