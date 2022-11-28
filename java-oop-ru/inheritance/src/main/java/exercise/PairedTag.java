package exercise;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String tagBody;
    private List<Tag> tagChild;

    public PairedTag(String tagName, Map<String, String> tagAttributes, String tagBody, List<Tag> tagChild) {
        super(tagName, tagAttributes);
        this.tagBody = tagBody;
        this.tagChild = tagChild;
    }

    public String getTagBody() {
        return tagBody;
    }

    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }

    public List<Tag> getTagChild() {
        return tagChild;
    }

    public void setTagChild(List<Tag> tagChild) {
        this.tagChild = tagChild;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getTagName());
        if (getTagAttributes().isEmpty()) {
            sb.append(">").append("</").append(getTagName()).append(">");
        } else {
            sb.append(" ");
            sb.append(
                    getTagAttributes().entrySet().stream()
                            .map(e -> e.getKey() + "=\"" + e.getValue() + "\"")
                            .collect(Collectors.joining(" "))
            );
            sb.append(">");
            sb.append(getTagBody());
            sb.append(
                    getTagChild().stream()
                            .map(Tag::toString)
                            .collect(Collectors.joining(""))
            );
            sb.append("</").append(getTagName()).append(">");
        }
        return sb.toString();
    }
}
// END
