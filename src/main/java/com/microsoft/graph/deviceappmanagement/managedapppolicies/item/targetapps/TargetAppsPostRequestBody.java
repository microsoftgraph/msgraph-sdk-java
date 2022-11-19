package com.microsoft.graph.deviceappmanagement.managedapppolicies.item.targetapps;

import com.microsoft.graph.models.ManagedMobileApp;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the targetApps method. */
public class TargetAppsPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The apps property */
    private java.util.List<ManagedMobileApp> _apps;
    /**
     * Instantiates a new targetAppsPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TargetAppsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a targetAppsPostRequestBody
     */
    @javax.annotation.Nonnull
    public static TargetAppsPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TargetAppsPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the apps property value. The apps property
     * @return a managedMobileApp
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedMobileApp> getApps() {
        return this._apps;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TargetAppsPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(1);
        deserializerMap.put("apps", (n) -> { currentObject.setApps(n.getCollectionOfObjectValues(ManagedMobileApp::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("apps", this.getApps());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the apps property value. The apps property
     * @param value Value to set for the apps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApps(@javax.annotation.Nullable final java.util.List<ManagedMobileApp> value) {
        this._apps = value;
    }
}
