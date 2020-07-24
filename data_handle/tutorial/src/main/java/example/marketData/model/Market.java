package example.marketData.model;

import java.io.Serializable;
import java.util.Objects;

public class Market implements Serializable {

    private int kontragentKodu;
    private String kontragentAd;
    private String malKod;
    private String malAd;
    private String ov;
    private String marka;
    private int satish;
    private double alishQiymet;
    private double alishMebleg;
    private double satishQiymet;
    private double satishMebleg;
    private int qaliq;
    private String kod;
    private String ad;


    public Market() {

    }

    public Market(int kontragentKodu, String kontragentAd, String malKod, String malAd, String ov, String marka, int satish, double alishQiymet, double alishMebleg, double satishQiymet, double satishMebleg, int qaliq, String kod, String ad) {
        this.kontragentKodu = kontragentKodu;
        this.kontragentAd = kontragentAd;
        this.malKod = malKod;
        this.malAd = malAd;
        this.ov = ov;
        this.marka = marka;
        this.satish = satish;
        this.alishQiymet = alishQiymet;
        this.alishMebleg = alishMebleg;
        this.satishQiymet = satishQiymet;
        this.satishMebleg = satishMebleg;
        this.qaliq = qaliq;
        this.kod = kod;
        this.ad = ad;
    }

    public int getKontragentKodu() {
        return kontragentKodu;
    }

    public void setKontragentKodu(int kontragentKodu) {
        this.kontragentKodu = kontragentKodu;
    }

    public String getKontragentAd() {
        return kontragentAd;
    }

    public void setKontragentAd(String kontragentAd) {
        this.kontragentAd = kontragentAd;
    }

    public String getMalKod() {
        return malKod;
    }

    public void setMalKod(String malKod) {
        this.malKod = malKod;
    }

    public String getMalAd() {
        return malAd;
    }

    public void setMalAd(String malAd) {
        this.malAd = malAd;
    }

    public String getOv() {
        return ov;
    }

    public void setOv(String ov) {
        this.ov = ov;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getSatish() {
        return satish;
    }

    public void setSatish(int satish) {
        this.satish = satish;
    }

    public double getAlishQiymet() {
        return alishQiymet;
    }

    public void setAlishQiymet(double alishQiymet) {
        this.alishQiymet = alishQiymet;
    }

    public double getAlishMebleg() {
        return alishMebleg;
    }

    public void setAlishMebleg(double alishMebleg) {
        this.alishMebleg = alishMebleg;
    }

    public double getSatishQiymet() {
        return satishQiymet;
    }

    public void setSatishQiymet(double satishQiymet) {
        this.satishQiymet = satishQiymet;
    }

    public double getSatishMebleg() {
        return satishMebleg;
    }

    public void setSatishMebleg(double satishMebleg) {
        this.satishMebleg = satishMebleg;
    }

    public int getQaliq() {
        return qaliq;
    }

    public void setQaliq(int qaliq) {
        this.qaliq = qaliq;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Market that = (Market) o;
        return kontragentKodu == that.kontragentKodu &&
                satish == that.satish &&
                Double.compare(that.alishQiymet, alishQiymet) == 0 &&
                Double.compare(that.alishMebleg, alishMebleg) == 0 &&
                Double.compare(that.satishQiymet, satishQiymet) == 0 &&
                Double.compare(that.satishMebleg, satishMebleg) == 0 &&
                qaliq == that.qaliq &&
                kontragentAd.equals(that.kontragentAd) &&
                malKod.equals(that.malKod) &&
                malAd.equals(that.malAd) &&
                ov.equals(that.ov) &&
                marka.equals(that.marka) &&
                kod.equals(that.kod) &&
                ad.equals(that.ad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kontragentKodu, kontragentAd, malKod, malAd, ov, marka, satish, alishQiymet, alishMebleg, satishQiymet, satishMebleg, qaliq, kod, ad);
    }

    @Override
    public String toString() {
        return "Market{" +
                "kontragentKodu=" + kontragentKodu +
                ", kontragentAd='" + kontragentAd + '\'' +
                ", malKod='" + malKod + '\'' +
                ", malAd='" + malAd + '\'' +
                ", ov='" + ov + '\'' +
                ", marka='" + marka + '\'' +
                ", satish=" + satish +
                ", alishQiymet=" + alishQiymet +
                ", alishMebleg=" + alishMebleg +
                ", satishQiymet=" + satishQiymet +
                ", satishMebleg=" + satishMebleg +
                ", qaliq=" + qaliq +
                ", kod='" + kod + '\'' +
                ", ad='" + ad + '\'' +
                '}';
    }
}
