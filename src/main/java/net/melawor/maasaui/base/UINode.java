package net.melawor.maasaui.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for all nodes
 *
 * @author Michael Eberlein
 */
public abstract class UINode {

    /**
     * Child nodes
     */
    public List<UINode> children = new ArrayList<>();
}
