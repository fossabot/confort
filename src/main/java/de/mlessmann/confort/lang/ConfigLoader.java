package de.mlessmann.confort.lang;

import de.mlessmann.confort.node.ConfigNode;
import de.mlessmann.confort.api.IConfigLoader;
import de.mlessmann.confort.api.IConfigNode;
import de.mlessmann.confort.api.except.ParseException;

import java.io.*;

public abstract class ConfigLoader implements IConfigLoader {

    public IConfigNode parse(File configFile) throws IOException, ParseException {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(configFile))) {
            IConfigNode root = parse(reader);

            // If the parse result is NULL, we look at an empty configuration.
            // Otherwise a ParseException would've been thrown.
            if (root != null) {
                return root;
            } else {
                return new ConfigNode();
            }
        }
    }

    public abstract IConfigNode parse(Reader reader) throws IOException, ParseException;

    public void save(IConfigNode root, File configFile) throws IOException {
        try (OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(configFile))) {
            save(root, out);
        }
    }

    public void save(IConfigNode root, Writer writer) throws IOException {
        root.collapse();
        getSerializer().serializeNode(root, writer);
    }

    public abstract ConfigSerializer getSerializer();
}
