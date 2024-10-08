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
public class WorkbookRangeFont extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkbookRangeFont} and sets the default values.
     */
    public WorkbookRangeFont() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkbookRangeFont}
     */
    @jakarta.annotation.Nonnull
    public static WorkbookRangeFont createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookRangeFont();
    }
    /**
     * Gets the bold property value. Inidicates whether the font is bold.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBold() {
        return this.backingStore.get("bold");
    }
    /**
     * Gets the color property value. The HTML color code representation of the text color. For example, #FF0000 represents the color red.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getColor() {
        return this.backingStore.get("color");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bold", (n) -> { this.setBold(n.getBooleanValue()); });
        deserializerMap.put("color", (n) -> { this.setColor(n.getStringValue()); });
        deserializerMap.put("italic", (n) -> { this.setItalic(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getObjectValue(WorkbookRangeFontSize::createFromDiscriminatorValue)); });
        deserializerMap.put("underline", (n) -> { this.setUnderline(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the italic property value. Inidicates whether the font is italic.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getItalic() {
        return this.backingStore.get("italic");
    }
    /**
     * Gets the name property value. The font name. For example, 'Calibri'.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the size property value. The font size.
     * @return a {@link WorkbookRangeFontSize}
     */
    @jakarta.annotation.Nullable
    public WorkbookRangeFontSize getSize() {
        return this.backingStore.get("size");
    }
    /**
     * Gets the underline property value. The type of underlining applied to the font. The possible values are: None, Single, Double, SingleAccountant, DoubleAccountant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUnderline() {
        return this.backingStore.get("underline");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("bold", this.getBold());
        writer.writeStringValue("color", this.getColor());
        writer.writeBooleanValue("italic", this.getItalic());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("size", this.getSize());
        writer.writeStringValue("underline", this.getUnderline());
    }
    /**
     * Sets the bold property value. Inidicates whether the font is bold.
     * @param value Value to set for the bold property.
     */
    public void setBold(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bold", value);
    }
    /**
     * Sets the color property value. The HTML color code representation of the text color. For example, #FF0000 represents the color red.
     * @param value Value to set for the color property.
     */
    public void setColor(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("color", value);
    }
    /**
     * Sets the italic property value. Inidicates whether the font is italic.
     * @param value Value to set for the italic property.
     */
    public void setItalic(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("italic", value);
    }
    /**
     * Sets the name property value. The font name. For example, 'Calibri'.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the size property value. The font size.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final WorkbookRangeFontSize value) {
        this.backingStore.set("size", value);
    }
    /**
     * Sets the underline property value. The type of underlining applied to the font. The possible values are: None, Single, Double, SingleAccountant, DoubleAccountant.
     * @param value Value to set for the underline property.
     */
    public void setUnderline(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("underline", value);
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class WorkbookRangeFontSize implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link WorkbookRangeFontSize} and sets the default values.
         */
        public WorkbookRangeFontSize() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link WorkbookRangeFontSize}
         */
        @jakarta.annotation.Nonnull
        public static WorkbookRangeFontSize createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final WorkbookRangeFontSize result = new WorkbookRangeFontSize();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
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
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
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
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
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
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
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
