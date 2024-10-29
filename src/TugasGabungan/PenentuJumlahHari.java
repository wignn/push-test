package TugasGabungan;

import TugasGabungan.HitungHari;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class PenentuJumlahHari extends JFrame implements ActionListener {
    private JTextField yearField;
    private JComboBox<String> monthBox;
    private JLabel resultLabel;
    private HitungHari hitungHari;

    public PenentuJumlahHari() {
        hitungHari = new HitungHari();

        setTitle("Aplikasi Penentu Jumlah Hari");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2, 5, 5));
        inputPanel.setBackground(Color.GREEN);

        inputPanel.add(new JLabel("Tahun"));
        yearField = new JTextField();
        inputPanel.add(yearField);

        inputPanel.add(new JLabel("Bulan"));
        monthBox = new JComboBox<>(new String[]{"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"});
        inputPanel.add(monthBox);

        add(inputPanel, BorderLayout.CENTER);

        resultLabel = new JLabel("", JLabel.CENTER);
        resultLabel.setBackground(Color.YELLOW);
        resultLabel.setOpaque(true);
        add(resultLabel, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4, 5, 5));

        JButton hitungButton = new JButton("Hitung");
        JButton hapusButton = new JButton("Hapus");
        JButton simpanButton = new JButton("Simpan");
        JButton keluarButton = new JButton("Keluar");

        hitungButton.addActionListener(this);
        hapusButton.addActionListener(this);
        simpanButton.addActionListener(this);
        keluarButton.addActionListener(this);

        buttonPanel.add(hitungButton);
        buttonPanel.add(hapusButton);
        buttonPanel.add(simpanButton);
        buttonPanel.add(keluarButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Hitung")) {
            try {
                int year = Integer.parseInt(yearField.getText());
                int month = monthBox.getSelectedIndex() + 1;
                int days = hitungHari.hitung(year, month);
                resultLabel.setText("Jumlah hari: " + days);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Masukkan tahun yang valid.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (command.equals("Hapus")) {
            yearField.setText("");
            monthBox.setSelectedIndex(0);
            resultLabel.setText("");
        } else if (command.equals("Simpan")) {
            try (FileWriter writer = new FileWriter("hasil_perhitungan.txt", true)) {
                writer.write("Tahun: " + yearField.getText() + ", Bulan: " + monthBox.getSelectedItem() + ", " + resultLabel.getText() + "\n");
                JOptionPane.showMessageDialog(this, "Hasil disimpan.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saat menyimpan.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (command.equals("Keluar")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new PenentuJumlahHari();
    }
}
