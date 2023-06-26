import javax.swing.*;
import java.util.HashMap;

public class VaccineQuery {
    public static void main(String[] args) {
        starter();
    }

    private static String query() {
        String vaccine = JOptionPane.showInputDialog("請輸入疫苗名稱(AZ, BNT, Moderna, Janssen: ").toLowerCase();

        HashMap<String, String> VaccineType = new HashMap<String, String>();
        VaccineType.put("az", "研發國:英國、瑞典\n種類:腺病毒疫苗\n劑量:2\n保護率:81%");
        VaccineType.put("bnt", "研發國:德國、美國\n種類:mRNA疫苗\n劑量:2\n保護率:95%");
        VaccineType.put("moderna", "研發國:美國\n種類:mRNA疫苗\n劑量:2\n保護率:94%");
        VaccineType.put("janssen", "研發國:美國、比利時\n種類:腺病毒疫苗\n劑量:1\n保護率:66%");

        String result = VaccineType.get(vaccine);
        return result != null && result.length() > 0 ? result : "Wrong";
    }

    public static void starter() {
        JOptionPane.showMessageDialog(null, query());
    }
}
