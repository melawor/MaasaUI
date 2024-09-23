package net.melawor.maasaui.base;

import java.util.HashMap;
import java.util.Map;

/**
 * Element node (tag)
 *
 * @author Michael Eberlein
 */
public class ElementUINode extends UINode {

    /**
     * Name
     */
    public String name;

    /**
     * Attributes
     */
    public Map<String, String> attributes = new HashMap<>();
}
