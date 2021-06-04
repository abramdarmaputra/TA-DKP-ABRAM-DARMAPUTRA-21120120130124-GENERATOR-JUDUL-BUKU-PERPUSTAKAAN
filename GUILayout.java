import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUILayout {
    private JButton clearButton;
    private JButton changeButton;
    private JTextArea textArea;
    private JTextField textField;
    private JPanel myPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Generator Judul Buku Perpustakaan");
        frame.setContentPane(new GUILayout().myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public GUILayout() {
        changeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String words = textField.getText();

                // proses format kata
                String formattedWords = formatWords(words);

                // tampilkan output, diubah sesuai kebutuhan
                // utk cetak outputnya (bisa pake textbox, dsb.)
                textArea.setText(formattedWords);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                textField.setText("");
            }
        });
    }

    private static String formatWords(final String words) {

        // inisialisasi variabel string baru
        String formattedWords = "";

        // Pembuatan objek berdasarkan class konjungsi
        konjungsi conjunct = new konjungsi();

        // lakukan perulangan pada setiap kata dalam kalimat
        // (split berdasarkan whitespace / spasi)
        for (String word : words.split(" ")) {
            if (conjunct.isConjunction(word)) {
                // jika kata bersifat konjungsi, ubah ke lower case,
                // lalu tambahkan ke variabel formattedWords
                formattedWords += word.toLowerCase();
            } else {
                // jika kata biasa, ubah ke title case (kapital di huruf awal),
                // lalu tambahkan ke variabel formattedWords
                formattedWords += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            }
            // pastikan ada spasi antar kata
            formattedWords += " ";
        }
        return formattedWords;
    }
}

