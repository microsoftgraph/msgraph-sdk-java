package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityUserFlow extends Entity implements Parsable {
    /**
     * Instantiates a new {@link IdentityUserFlow} and sets the default values.
     */
    public IdentityUserFlow() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IdentityUserFlow}
     */
    @jakarta.annotation.Nonnull
    public static IdentityUserFlow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.b2xIdentityUserFlow": return new B2xIdentityUserFlow();
            }
        }
        return new IdentityUserFlow();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userFlowType", (n) -> { this.setUserFlowType(n.getEnumValue(UserFlowType::forValue)); });
        deserializerMap.put("userFlowTypeVersion", (n) -> { this.setUserFlowTypeVersion(n.getObjectValue(IdentityUserFlowUserFlowTypeVersion::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the userFlowType property value. The userFlowType property
     * @return a {@link UserFlowType}
     */
    @jakarta.annotation.Nullable
    public UserFlowType getUserFlowType() {
        return this.backingStore.get("userFlowType");
    }
    /**
     * Gets the userFlowTypeVersion property value. The userFlowTypeVersion property
     * @return a {@link IdentityUserFlowUserFlowTypeVersion}
     */
    @jakarta.annotation.Nullable
    public IdentityUserFlowUserFlowTypeVersion getUserFlowTypeVersion() {
        return this.backingStore.get("userFlowTypeVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("userFlowType", this.getUserFlowType());
        writer.writeObjectValue("userFlowTypeVersion", this.getUserFlowTypeVersion());
    }
    /**
     * Sets the userFlowType property value. The userFlowType property
     * @param value Value to set for the userFlowType property.
     */
    public void setUserFlowType(@jakarta.annotation.Nullable final UserFlowType value) {
        this.backingStore.set("userFlowType", value);
    }
    /**
     * Sets the userFlowTypeVersion property value. The userFlowTypeVersion property
     * @param value Value to set for the userFlowTypeVersion property.
     */
    public void setUserFlowTypeVersion(@jakarta.annotation.Nullable final IdentityUserFlowUserFlowTypeVersion value) {
        this.backingStore.set("userFlowTypeVersion", value);
    }
    /**
     * Composed type wrapper for classes {@link Float}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class IdentityUserFlowUserFlowTypeVersion implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link IdentityUserFlowUserFlowTypeVersion} and sets the default values.
         */
        public IdentityUserFlowUserFlowTypeVersion() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link IdentityUserFlowUserFlowTypeVersion}
         */
        @jakarta.annotation.Nonnull
        public static IdentityUserFlowUserFlowTypeVersion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final IdentityUserFlowUserFlowTypeVersion result = new IdentityUserFlowUserFlowTypeVersion();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getFloatValue() != null) {
                result.setFloat(parseNode.getFloatValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the float property value. Composed type representation for type {@link Float}
         * @return a {@link Float}
         */
        @jakarta.annotation.Nullable
        public Float getFloat() {
            return this.backingStore.get("float");
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getFloat() != null) {
                writer.writeFloatValue(null, this.getFloat());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the float property value. Composed type representation for type {@link Float}
         * @param value Value to set for the float property.
         */
        public void setFloat(@jakarta.annotation.Nullable final Float value) {
            this.backingStore.set("float", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
}
