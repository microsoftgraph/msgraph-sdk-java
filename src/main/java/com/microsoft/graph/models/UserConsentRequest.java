package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserConsentRequest extends Request implements Parsable {
    /**
     * Approval decisions associated with a request.
     */
    private Approval approval;
    /**
     * The user's justification for requiring access to the app. Supports $filter (eq only) and $orderby.
     */
    private String reason;
    /**
     * Instantiates a new userConsentRequest and sets the default values.
     */
    public UserConsentRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userConsentRequest
     */
    @jakarta.annotation.Nonnull
    public static UserConsentRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserConsentRequest();
    }
    /**
     * Gets the approval property value. Approval decisions associated with a request.
     * @return a approval
     */
    @jakarta.annotation.Nullable
    public Approval getApproval() {
        return this.approval;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("approval", (n) -> { this.setApproval(n.getObjectValue(Approval::createFromDiscriminatorValue)); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the reason property value. The user's justification for requiring access to the app. Supports $filter (eq only) and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("approval", this.getApproval());
        writer.writeStringValue("reason", this.getReason());
    }
    /**
     * Sets the approval property value. Approval decisions associated with a request.
     * @param value Value to set for the approval property.
     */
    public void setApproval(@jakarta.annotation.Nullable final Approval value) {
        this.approval = value;
    }
    /**
     * Sets the reason property value. The user's justification for requiring access to the app. Supports $filter (eq only) and $orderby.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
}
