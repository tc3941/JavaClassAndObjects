public class PcBuild {
    private String cpu,gpu,psu;
    private String[] ram = new String[4];

    public PcBuild(){

    }
    public PcBuild(String gpu,String cpu){

    }
    public PcBuild(String gpu,String cpu, String psu){

    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public String getPsu() {
        return psu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setPsu(String psu) {
        this.psu = psu;
    }

    public boolean bareBoneBuild(){
        return psu==null ||  psu.isEmpty();
    }
    public String buildDescription(){
        return "GPU: " + getGpu() + ", CPU: " + getCpu() + ( bareBoneBuild() ? "" : ", PSU: " + getPsu());
    }
}
