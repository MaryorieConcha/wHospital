import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import java.io.IOException;
import java.util.Date;

public class GestorPDF {
    public void generarPDF(Paciente paciente, Medico medico, String rut) throws IOException {
//Se crea un nuevo documento
        PDDocument documento = new PDDocument();
//Al documento se le crea y agrega una nueva página, en este caso en formato A6
        PDPage pagina = new PDPage(PDRectangle.A6);
        documento.addPage(pagina);
//Se genera un arreglo de líneas que va a tener el archivo PDF
        String[] lineasPdf= this.obtenerLineasPdf(paciente, medico);
        this.rellenarPDF(documento,pagina,lineasPdf);
//Se guarda el documento en la ubicación descrita
        documento.save(this.generarNombrePdf(rut));
        documento.close();
    }

    public void rellenarPDF(PDDocument documento, PDPage pagina, String[] lineasVenta){
//Por cada linea del arreglo, se irá agregando texto
        try (PDPageContentStream contenidoPagina = new PDPageContentStream(documento, pagina)) {
            for(int linea=0; linea<lineasVenta.length; linea++) {
                contenidoPagina.beginText();
//Se define en que posición del documento estará el texto
                contenidoPagina.newLineAtOffset(10, pagina.getMediaBox().getHeight()-(10*linea));
                contenidoPagina.setFont(PDType1Font.HELVETICA_BOLD, 8f);
//Agrega el texto al documento
                contenidoPagina.showText(lineasVenta[linea]);
                contenidoPagina.endText();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] obtenerLineasPdf(Paciente paciente, Medico medico){
        String[] lineasPdf= new String[5];
        lineasPdf[0]="Registro del Paciente";
        lineasPdf[1]="Hospital Temuco";
        lineasPdf[2]="Paciente: " + paciente.toString();
        lineasPdf[3]="Registro realizado por";
        lineasPdf[4]="Doctor(a): " + medico.getNombre();
        return lineasPdf;
    }

    private String generarNombrePdf(String rut){
        String nombreArchivo="Registro del Paciente/Rut"+rut+".pdf";
        return nombreArchivo;
    }
}
