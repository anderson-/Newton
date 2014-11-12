/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3f.newton;

import javax.swing.JRootPane;
import s3f.core.plugin.Data;
import s3f.core.plugin.Plugabble;
import s3f.core.project.Editor;
import s3f.core.project.Element;
import s3f.core.ui.tab.TabProperty;

/**
 *
 * @author anderson
 */
public class NewtonGraphViewer implements Editor {

//    private static final ImageIcon ICON = new ImageIcon(ModularCircuitEditor.class.getResource("/resources/icons/fugue/block.png"));
    private final Data data;
    private final de.jg3d.Main pane;
    private DOTFile graph;

    public NewtonGraphViewer() {
        data = new Data("editorTab", "s3f.core.code", "Editor Tab");
        pane = de.jg3d.Main.createFrame();
        TabProperty.put(data, "Editor", null, "Editor de código", pane);
    }

    @Override
    public void setContent(Element content) {
        pane.removeAll();
        if (content instanceof DOTFile) {
            graph = (DOTFile) content;
            data.setProperty(TabProperty.TITLE, content.getName());
            data.setProperty(TabProperty.ICON, content.getIcon());
            de.jg3d.util.Importer.importContent(pane.getGraph(), graph.getText());
        }
    }

    @Override
    public Element getContent() {
        return graph;
    }

    @Override
    public void update() {
//        EntityManager em = PluginManager.getInstance().createFactoryManager(null);
//        Simulator sim = (Simulator) em.getProperty("s3f.core.interpreter.tmp", "interpreter");
//        Interpreter i = new Interpreter();
//        for (Object o : flowchart.getExternalResources()) {
//            i.addResource(o);
//        }
//        i.setMainFunction(flowchartPanel.getFunction());
//        sim.clear();
//        sim.add(i);
    }

    @Override
    public void selected() {

    }

    @Override
    public Data getData() {
        return data;
    }

    @Override
    public void init() {

    }

    @Override
    public Plugabble createInstance() {
        return new NewtonGraphViewer();
    }
}
