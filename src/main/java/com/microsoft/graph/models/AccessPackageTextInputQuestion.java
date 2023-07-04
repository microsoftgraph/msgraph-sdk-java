package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageTextInputQuestion extends AccessPackageQuestion implements Parsable {
    /**
     * Indicates whether the answer will be in single or multiple line format.
     */
    private Boolean isSingleLineQuestion;
    /**
     * The regular expression pattern which any answer to this question must match.
     */
    private String regexPattern;
    /**
     * Instantiates a new AccessPackageTextInputQuestion and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageTextInputQuestion() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageTextInputQuestion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageTextInputQuestion
     */
    @javax.annotation.Nonnull
    public static AccessPackageTextInputQuestion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageTextInputQuestion();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isSingleLineQuestion", (n) -> { this.setIsSingleLineQuestion(n.getBooleanValue()); });
        deserializerMap.put("regexPattern", (n) -> { this.setRegexPattern(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isSingleLineQuestion property value. Indicates whether the answer will be in single or multiple line format.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSingleLineQuestion() {
        return this.isSingleLineQuestion;
    }
    /**
     * Gets the regexPattern property value. The regular expression pattern which any answer to this question must match.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegexPattern() {
        return this.regexPattern;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isSingleLineQuestion", this.getIsSingleLineQuestion());
        writer.writeStringValue("regexPattern", this.getRegexPattern());
    }
    /**
     * Sets the isSingleLineQuestion property value. Indicates whether the answer will be in single or multiple line format.
     * @param value Value to set for the isSingleLineQuestion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSingleLineQuestion(@javax.annotation.Nullable final Boolean value) {
        this.isSingleLineQuestion = value;
    }
    /**
     * Sets the regexPattern property value. The regular expression pattern which any answer to this question must match.
     * @param value Value to set for the regexPattern property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegexPattern(@javax.annotation.Nullable final String value) {
        this.regexPattern = value;
    }
}
