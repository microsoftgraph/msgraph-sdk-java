package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageTextInputQuestion extends AccessPackageQuestion implements Parsable {
    /**
     * Instantiates a new {@link AccessPackageTextInputQuestion} and sets the default values.
     */
    public AccessPackageTextInputQuestion() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageTextInputQuestion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessPackageTextInputQuestion}
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageTextInputQuestion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageTextInputQuestion();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isSingleLineQuestion", (n) -> { this.setIsSingleLineQuestion(n.getBooleanValue()); });
        deserializerMap.put("regexPattern", (n) -> { this.setRegexPattern(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isSingleLineQuestion property value. Indicates whether the answer is in single or multiple line format.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSingleLineQuestion() {
        return this.backingStore.get("isSingleLineQuestion");
    }
    /**
     * Gets the regexPattern property value. The regular expression pattern that any answer to this question must match.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegexPattern() {
        return this.backingStore.get("regexPattern");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isSingleLineQuestion", this.getIsSingleLineQuestion());
        writer.writeStringValue("regexPattern", this.getRegexPattern());
    }
    /**
     * Sets the isSingleLineQuestion property value. Indicates whether the answer is in single or multiple line format.
     * @param value Value to set for the isSingleLineQuestion property.
     */
    public void setIsSingleLineQuestion(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSingleLineQuestion", value);
    }
    /**
     * Sets the regexPattern property value. The regular expression pattern that any answer to this question must match.
     * @param value Value to set for the regexPattern property.
     */
    public void setRegexPattern(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("regexPattern", value);
    }
}
