package com.microsoft.graph.models;

import com.microsoft.graph.models.ChatMessageHostedContent;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class TeamworkHostedContent extends Entity implements Parsable {
    /** Write only. Bytes for the hosted content (such as images). */
    private byte[] _contentBytes;
    /** Write only. Content type. sicj as image/png, image/jpg. */
    private String _contentType;
    /**
     * Instantiates a new teamworkHostedContent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkHostedContent() {
        super();
        this.setOdataType("#microsoft.graph.teamworkHostedContent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkHostedContent
     */
    @javax.annotation.Nonnull
    public static TeamworkHostedContent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.chatMessageHostedContent": return new ChatMessageHostedContent();
            }
        }
        return new TeamworkHostedContent();
    }
    /**
     * Gets the contentBytes property value. Write only. Bytes for the hosted content (such as images).
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getContentBytes() {
        return this._contentBytes;
    }
    /**
     * Gets the contentType property value. Write only. Content type. sicj as image/png, image/jpg.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentType() {
        return this._contentType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkHostedContent currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("contentBytes", (n) -> { currentObject.setContentBytes(n.getByteArrayValue()); });
            this.put("contentType", (n) -> { currentObject.setContentType(n.getStringValue()); });
        }};
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
        writer.writeByteArrayValue("contentBytes", this.getContentBytes());
        writer.writeStringValue("contentType", this.getContentType());
    }
    /**
     * Sets the contentBytes property value. Write only. Bytes for the hosted content (such as images).
     * @param value Value to set for the contentBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentBytes(@javax.annotation.Nullable final byte[] value) {
        this._contentBytes = value;
    }
    /**
     * Sets the contentType property value. Write only. Content type. sicj as image/png, image/jpg.
     * @param value Value to set for the contentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentType(@javax.annotation.Nullable final String value) {
        this._contentType = value;
    }
}
