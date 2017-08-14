
package vendaeletro;


public class Tampa {
    private String tampaCor;
    private String tampaDesc;
    
    public Tampa(String tampaCor,String tampaDesc){
        this.tampaCor = tampaCor;
        this.tampaDesc = tampaDesc;
    }

    public String getTampaCor() {
        return tampaCor;
    }

    public void setTampaCor(String tampaCor) {
        this.tampaCor = tampaCor;
    }

    public String getTampaDesc() {
        return tampaDesc;
    }

    public void setTampaDesc(String tampaDesc) {
        this.tampaDesc = tampaDesc;
    }   
}
