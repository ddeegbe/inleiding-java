public class opdracht1 {
}

import javax.swing.JFrame;
        import javax.swing.JScrollPane;
        import javax.swing.JTable;
        import javax.swing.ListSelectionModel;
        import javax.swing.event.ListSelectionEvent;
        import javax.swing.event.ListSelectionListener;

public class JTableListSelectionListener {

    public static void main(String[] a) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JTable table;

        String[] columnTitles = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        Object[][] rowData = { { " }, { " },
                {  }, { } };

        table = new JTable(rowData, columnTitles);

        table.setCellSelectionEnabled(true);
        ListSelectionModel cellSelectionModel = table.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String selectedData = null;

                int[] selectedRow = table.getSelectedRows();
                int[] selectedColumns = table.getSelectedColumns();

                for (int i = 0; i < selectedRow.length; i++) {
                    for (int j = 0; j < selectedColumns.length; j++) {
                        selectedData = (String) table.getValueAt(selectedRow[i], selectedColumns[j]);
                    }
                }
                System.out.println("Selected: " + selectedData);
            }

        });

        frame.add(new JScrollPane(table));

        frame.setSize(300, 200);
        frame.setVisible(true);
    }

}











