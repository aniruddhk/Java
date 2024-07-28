package JavaFeatures;

public class Thread3 implements Runnable{
    private  StringBuilder stringBuffer;

    public Thread3(StringBuilder stringBuffer){
        this.stringBuffer = stringBuffer;
    }
    @Override
    public void run() {
        stringBuffer.append("3");
    }
}
