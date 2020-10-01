package spring.boot.template.pdfbox;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestPdfBox {

    public static void main(String[] args) {

        ThreadLocal<String> ss = new ThreadLocal();
        String s = ss.get();
        ss.set("hao");
        List<String> name = new ArrayList<>();
        name.parallelStream().forEach(o->{});

        String source = "C:\\Users\\Administrator\\Desktop\\test_pdf\\he1.pdf";
        String save = "C:\\Users\\Administrator\\Desktop\\test_pdf\\he1.pdf";
//        //加载
//        try {
//            PDDocument load = PDDocument.load(new File(source));
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        saveText(save);
        //保存

    }

    private static void saveText(String save) {
        try {
//            String content = "我是中文";
            String content = "eeen";
            PDDocument saveDoc = new PDDocument();
            PDPage page = new PDPage(PDRectangle.A4);
            PDPageContentStream contentStream = new PDPageContentStream(saveDoc, page);
            PDFont font = PDType1Font.HELVETICA;
            contentStream.setFont(font, 12);
            contentStream.beginText();
            contentStream.newLineAtOffset(100, 100);
            contentStream.showText(content);
            contentStream.endText();


            contentStream.close();
            saveDoc.save(save);
            saveDoc.close();
            System.out.println("save " + content + " ok");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
