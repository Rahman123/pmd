/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTElement.java */

package net.sourceforge.pmd.lang.jsp.ast;

public class ASTElement extends AbstractJspNode {

    /**
     * Name of the element-tag. Cannot be null.
     */
    private String name;

    /**
     * Flag indicating that the element consists of one tag ("<... />").
     */
    private boolean empty; //

    /**
     * Flag indicating that the parser did not find a proper ending marker or
     * ending tag for this element
     */
    private boolean unclosed;

    public ASTElement(int id) {
        super(id);
    }

    public ASTElement(JspParser p, int id) {
        super(p, id);
    }

    /**
     * @return boolean - true if the element has a namespace-prefix, false
     *         otherwise
     */
    public boolean isHasNamespacePrefix() {
        return name.indexOf(':') >= 0;
    }

    /**
     * @return String - the part of the name that is before the (first) colon
     *         (":")
     */
    public String getNamespacePrefix() {
        int colonIndex = name.indexOf(':');
        return colonIndex >= 0 ? name.substring(0, colonIndex) : "";
    }

    /**
     * @return String - The part of the name that is after the first colon
     *         (":"). If the name does not contain a colon, the full name is
     *         returned.
     */
    public String getLocalName() {
        int colonIndex = name.indexOf(':');
        return colonIndex >= 0 ? name.substring(colonIndex + 1) : name;
    }

    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Returns the empty.
     */
    public boolean isEmpty() {
        return empty;
    }

    public boolean isUnclosed() {
        return unclosed;
    }

    public void setUnclosed(boolean unclosed) {
        this.unclosed = unclosed;
    }

    /**
     * @param empty
     *            The empty to set.
     */
    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    /**
     * Accept the visitor. *
     */
    @Override
    public Object jjtAccept(JspParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
