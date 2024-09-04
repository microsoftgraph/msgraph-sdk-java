package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExchangeRestoreSession extends RestoreSessionBase implements Parsable {
    /**
     * Instantiates a new {@link ExchangeRestoreSession} and sets the default values.
     */
    public ExchangeRestoreSession() {
        super();
        this.setOdataType("#microsoft.graph.exchangeRestoreSession");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExchangeRestoreSession}
     */
    @jakarta.annotation.Nonnull
    public static ExchangeRestoreSession createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExchangeRestoreSession();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("granularMailboxRestoreArtifacts", (n) -> { this.setGranularMailboxRestoreArtifacts(n.getCollectionOfObjectValues(GranularMailboxRestoreArtifact::createFromDiscriminatorValue)); });
        deserializerMap.put("mailboxRestoreArtifacts", (n) -> { this.setMailboxRestoreArtifacts(n.getCollectionOfObjectValues(MailboxRestoreArtifact::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the granularMailboxRestoreArtifacts property value. The granularMailboxRestoreArtifacts property
     * @return a {@link java.util.List<GranularMailboxRestoreArtifact>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GranularMailboxRestoreArtifact> getGranularMailboxRestoreArtifacts() {
        return this.backingStore.get("granularMailboxRestoreArtifacts");
    }
    /**
     * Gets the mailboxRestoreArtifacts property value. A collection of restore points and destination details that can be used to restore Exchange mailboxes.
     * @return a {@link java.util.List<MailboxRestoreArtifact>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MailboxRestoreArtifact> getMailboxRestoreArtifacts() {
        return this.backingStore.get("mailboxRestoreArtifacts");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("granularMailboxRestoreArtifacts", this.getGranularMailboxRestoreArtifacts());
        writer.writeCollectionOfObjectValues("mailboxRestoreArtifacts", this.getMailboxRestoreArtifacts());
    }
    /**
     * Sets the granularMailboxRestoreArtifacts property value. The granularMailboxRestoreArtifacts property
     * @param value Value to set for the granularMailboxRestoreArtifacts property.
     */
    public void setGranularMailboxRestoreArtifacts(@jakarta.annotation.Nullable final java.util.List<GranularMailboxRestoreArtifact> value) {
        this.backingStore.set("granularMailboxRestoreArtifacts", value);
    }
    /**
     * Sets the mailboxRestoreArtifacts property value. A collection of restore points and destination details that can be used to restore Exchange mailboxes.
     * @param value Value to set for the mailboxRestoreArtifacts property.
     */
    public void setMailboxRestoreArtifacts(@jakarta.annotation.Nullable final java.util.List<MailboxRestoreArtifact> value) {
        this.backingStore.set("mailboxRestoreArtifacts", value);
    }
}
