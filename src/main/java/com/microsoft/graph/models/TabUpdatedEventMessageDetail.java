package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TabUpdatedEventMessageDetail extends EventMessageDetail implements Parsable {
    /** Initiator of the event. */
    private IdentitySet initiator;
    /** Unique identifier of the tab. */
    private String tabId;
    /**
     * Instantiates a new TabUpdatedEventMessageDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TabUpdatedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.tabUpdatedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TabUpdatedEventMessageDetail
     */
    @javax.annotation.Nonnull
    public static TabUpdatedEventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TabUpdatedEventMessageDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("initiator", (n) -> { this.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("tabId", (n) -> { this.setTabId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getInitiator() {
        return this.initiator;
    }
    /**
     * Gets the tabId property value. Unique identifier of the tab.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTabId() {
        return this.tabId;
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
        writer.writeObjectValue("initiator", this.getInitiator());
        writer.writeStringValue("tabId", this.getTabId());
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInitiator(@javax.annotation.Nullable final IdentitySet value) {
        this.initiator = value;
    }
    /**
     * Sets the tabId property value. Unique identifier of the tab.
     * @param value Value to set for the tabId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTabId(@javax.annotation.Nullable final String value) {
        this.tabId = value;
    }
}
