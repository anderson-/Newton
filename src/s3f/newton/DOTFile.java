/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3f.newton;

import javax.swing.ImageIcon;
import s3f.core.plugin.Plugabble;
import s3f.core.project.ComplexElement;
import s3f.core.project.Element;
import s3f.core.project.Resource;
import s3f.core.project.editormanager.TextFile;

/**
 *
 * @author anderson
 */
public class DOTFile extends ComplexElement implements TextFile {

    public static final Element.CategoryData FLOWCHART_FILES = new Element.CategoryData("DOT File", "dot", new ImageIcon(DOTFile.class.getResource("/resources/icons/fugue/node.png")), new DOTFile());

    private String text = "";

    public DOTFile() {
        super("Empty DOT File", "/resources/icons/fugue/node.png", FLOWCHART_FILES, new Class[]{NewtonGraphViewer.class});
    }

    @Override
    public Plugabble createInstance() {
        return new DOTFile();
    }

    @Override
    public final void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void addResource(Resource resource) {
        super.addResource(resource);
//        if (resource.getPrimary() instanceof ModularCircuit) {
//            ModularCircuit flowchart = (ModularCircuit) resource.getPrimary();
//            flowchart.addExternalResource(resource.getSecondary());
//            Editor currentEditor = getCurrentEditor();
//            if (currentEditor != null) {
//                currentEditor.update();
//            }
//        }
    }

    @Override
    public void removeResource(Resource resource) {
        super.removeResource(resource);
//        if (resource.getPrimary() instanceof ModularCircuit) {
//            ModularCircuit flowchart = (ModularCircuit) resource.getPrimary();
//            flowchart.removeExternalResource(resource.getSecondary());
//            Editor currentEditor = getCurrentEditor();
//            if (currentEditor != null) {
//                currentEditor.update();
//            }
//        }
    }
}
