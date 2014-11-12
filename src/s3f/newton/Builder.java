/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3f.newton;

import s3f.core.plugin.PluginBuilder;

/**
 *
 * @author antunes
 */
public class Builder extends PluginBuilder {

    public Builder() {
        super("Newton");
    }

    @Override
    public void init() {
        pm.registerFactory(DOTFile.FLOWCHART_FILES);

        DOTFile dotFile = new DOTFile();
        dotFile.setName("4x4x4 Grid");
        dotFile.setText("0;2\n0;5\n0;17\n2;3\n2;6\n2;18\n3;4\n3;7\n3;19\n4;8\n4;20\n5;6\n5;9\n5;21\n6;7\n6;10\n6;22\n7;8\n7;11\n7;23\n8;12\n8;24\n9;10\n9;13\n9;25\n10;11\n10;14\n10;26\n11;12\n11;15\n11;27\n12;16\n12;28\n13;14\n13;29\n14;15\n14;30\n15;16\n15;31\n16;32\n17;18\n17;21\n17;33\n18;19\n18;22\n18;34\n19;20\n19;23\n19;35\n20;24\n20;36\n21;22\n21;25\n21;37\n22;23\n22;26\n22;38\n23;24\n23;27\n23;39\n24;28\n24;40\n25;26\n25;29\n25;41\n26;27\n26;30\n26;42\n27;28\n27;31\n27;43\n28;32\n28;44\n29;30\n29;45\n30;31\n30;46\n31;32\n31;47\n32;48\n33;34\n33;37\n33;49\n34;35\n34;38\n34;50\n35;36\n35;39\n35;51\n36;40\n36;52\n37;38\n37;41\n37;53\n38;39\n38;42\n38;54\n39;40\n39;43\n39;55\n40;44\n40;56\n41;42\n41;45\n41;57\n42;43\n42;46\n42;58\n43;44\n43;47\n43;59\n44;48\n44;60\n45;46\n45;61\n46;47\n46;62\n47;48\n47;63\n48;64\n49;50\n49;53\n50;51\n50;54\n51;52\n51;55\n52;56\n53;54\n53;57\n54;55\n54;58\n55;56\n55;59\n56;60\n57;58\n57;61\n58;59\n58;62\n59;60\n59;63\n60;64\n61;62\n62;63\n63;64");
        
        DOTFile.FLOWCHART_FILES.addModel(dotFile);
    }

}
