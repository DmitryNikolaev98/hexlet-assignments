package exercise;

import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
public class SingleTag extends Tag {

    public SingleTag(String tagName, Map<String, String> tagAttributes) {
        super(tagName, tagAttributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getTagName());

        if (getTagAttributes().isEmpty()) {
            sb.append(">");
        } else {
            sb.append(" ");
            sb.append(
                    getTagAttributes().entrySet().stream()
                            .map(e -> e.getKey() + "=\"" + e.getValue() + "\"")
                            .collect(Collectors.joining(" "))
            );
            sb.append(">");
        }
        return sb.toString();
    }
}
// END
