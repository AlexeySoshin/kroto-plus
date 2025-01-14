// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: krotoplus/compiler/config.proto

package com.github.marcoferrer.krotoplus.config;

/**
 * <pre>
 * Configuration used by the 'Proto Builders' code generator.
 * </pre>
 *
 * Protobuf type {@code krotoplus.compiler.ProtoBuildersGenOptions}
 */
public  final class ProtoBuildersGenOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:krotoplus.compiler.ProtoBuildersGenOptions)
    ProtoBuildersGenOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProtoBuildersGenOptions.newBuilder() to construct.
  private ProtoBuildersGenOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProtoBuildersGenOptions() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProtoBuildersGenOptions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.github.marcoferrer.krotoplus.config.FileFilter.Builder subBuilder = null;
            if (filter_ != null) {
              subBuilder = filter_.toBuilder();
            }
            filter_ = input.readMessage(com.github.marcoferrer.krotoplus.config.FileFilter.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(filter_);
              filter_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            unwrapBuilders_ = input.readBool();
            break;
          }
          case 24: {

            useDslMarkers_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.marcoferrer.krotoplus.config.Config.internal_static_krotoplus_compiler_ProtoBuildersGenOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.marcoferrer.krotoplus.config.Config.internal_static_krotoplus_compiler_ProtoBuildersGenOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions.class, com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions.Builder.class);
  }

  public static final int FILTER_FIELD_NUMBER = 1;
  private com.github.marcoferrer.krotoplus.config.FileFilter filter_;
  /**
   * <pre>
   * Filter used for limiting the input files that are processed by the code generator
   * The default filter will match true against all input files.
   * </pre>
   *
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  public boolean hasFilter() {
    return filter_ != null;
  }
  /**
   * <pre>
   * Filter used for limiting the input files that are processed by the code generator
   * The default filter will match true against all input files.
   * </pre>
   *
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  public com.github.marcoferrer.krotoplus.config.FileFilter getFilter() {
    return filter_ == null ? com.github.marcoferrer.krotoplus.config.FileFilter.getDefaultInstance() : filter_;
  }
  /**
   * <pre>
   * Filter used for limiting the input files that are processed by the code generator
   * The default filter will match true against all input files.
   * </pre>
   *
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  public com.github.marcoferrer.krotoplus.config.FileFilterOrBuilder getFilterOrBuilder() {
    return getFilter();
  }

  public static final int UNWRAP_BUILDERS_FIELD_NUMBER = 2;
  private boolean unwrapBuilders_;
  /**
   * <pre>
   * By default the generated utility methods for building messages are
   * wrapped in an object similiar to a proto outer class. For better
   * ergonomics with code generated using 'java_multiple_files' the
   * builders can be unwrapped and generated at the root scope of
   * the output file.
   * </pre>
   *
   * <code>bool unwrap_builders = 2;</code>
   */
  public boolean getUnwrapBuilders() {
    return unwrapBuilders_;
  }

  public static final int USE_DSL_MARKERS_FIELD_NUMBER = 3;
  private boolean useDslMarkers_;
  /**
   * <pre>
   * Tag java builder classes with a kotlin interface annotated
   * with &#64;DslMarker. This requires the kroto-plus output directory to
   * match the generated java classes directory. Using &#64;DslMarker
   * provides safer and predictable dsl usage.
   * </pre>
   *
   * <code>bool use_dsl_markers = 3;</code>
   */
  public boolean getUseDslMarkers() {
    return useDslMarkers_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (filter_ != null) {
      output.writeMessage(1, getFilter());
    }
    if (unwrapBuilders_ != false) {
      output.writeBool(2, unwrapBuilders_);
    }
    if (useDslMarkers_ != false) {
      output.writeBool(3, useDslMarkers_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (filter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFilter());
    }
    if (unwrapBuilders_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, unwrapBuilders_);
    }
    if (useDslMarkers_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, useDslMarkers_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions)) {
      return super.equals(obj);
    }
    com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions other = (com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions) obj;

    if (hasFilter() != other.hasFilter()) return false;
    if (hasFilter()) {
      if (!getFilter()
          .equals(other.getFilter())) return false;
    }
    if (getUnwrapBuilders()
        != other.getUnwrapBuilders()) return false;
    if (getUseDslMarkers()
        != other.getUseDslMarkers()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasFilter()) {
      hash = (37 * hash) + FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getFilter().hashCode();
    }
    hash = (37 * hash) + UNWRAP_BUILDERS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUnwrapBuilders());
    hash = (37 * hash) + USE_DSL_MARKERS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUseDslMarkers());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Configuration used by the 'Proto Builders' code generator.
   * </pre>
   *
   * Protobuf type {@code krotoplus.compiler.ProtoBuildersGenOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:krotoplus.compiler.ProtoBuildersGenOptions)
      com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.marcoferrer.krotoplus.config.Config.internal_static_krotoplus_compiler_ProtoBuildersGenOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.marcoferrer.krotoplus.config.Config.internal_static_krotoplus_compiler_ProtoBuildersGenOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions.class, com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions.Builder.class);
    }

    // Construct using com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (filterBuilder_ == null) {
        filter_ = null;
      } else {
        filter_ = null;
        filterBuilder_ = null;
      }
      unwrapBuilders_ = false;

      useDslMarkers_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.marcoferrer.krotoplus.config.Config.internal_static_krotoplus_compiler_ProtoBuildersGenOptions_descriptor;
    }

    @java.lang.Override
    public com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions getDefaultInstanceForType() {
      return com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions build() {
      com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions buildPartial() {
      com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions result = new com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions(this);
      if (filterBuilder_ == null) {
        result.filter_ = filter_;
      } else {
        result.filter_ = filterBuilder_.build();
      }
      result.unwrapBuilders_ = unwrapBuilders_;
      result.useDslMarkers_ = useDslMarkers_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions) {
        return mergeFrom((com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions other) {
      if (other == com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions.getDefaultInstance()) return this;
      if (other.hasFilter()) {
        mergeFilter(other.getFilter());
      }
      if (other.getUnwrapBuilders() != false) {
        setUnwrapBuilders(other.getUnwrapBuilders());
      }
      if (other.getUseDslMarkers() != false) {
        setUseDslMarkers(other.getUseDslMarkers());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.github.marcoferrer.krotoplus.config.FileFilter filter_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.marcoferrer.krotoplus.config.FileFilter, com.github.marcoferrer.krotoplus.config.FileFilter.Builder, com.github.marcoferrer.krotoplus.config.FileFilterOrBuilder> filterBuilder_;
    /**
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public boolean hasFilter() {
      return filterBuilder_ != null || filter_ != null;
    }
    /**
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public com.github.marcoferrer.krotoplus.config.FileFilter getFilter() {
      if (filterBuilder_ == null) {
        return filter_ == null ? com.github.marcoferrer.krotoplus.config.FileFilter.getDefaultInstance() : filter_;
      } else {
        return filterBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public Builder setFilter(com.github.marcoferrer.krotoplus.config.FileFilter value) {
      if (filterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filter_ = value;
        onChanged();
      } else {
        filterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public Builder setFilter(
        com.github.marcoferrer.krotoplus.config.FileFilter.Builder builderForValue) {
      if (filterBuilder_ == null) {
        filter_ = builderForValue.build();
        onChanged();
      } else {
        filterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public Builder mergeFilter(com.github.marcoferrer.krotoplus.config.FileFilter value) {
      if (filterBuilder_ == null) {
        if (filter_ != null) {
          filter_ =
            com.github.marcoferrer.krotoplus.config.FileFilter.newBuilder(filter_).mergeFrom(value).buildPartial();
        } else {
          filter_ = value;
        }
        onChanged();
      } else {
        filterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public Builder clearFilter() {
      if (filterBuilder_ == null) {
        filter_ = null;
        onChanged();
      } else {
        filter_ = null;
        filterBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public com.github.marcoferrer.krotoplus.config.FileFilter.Builder getFilterBuilder() {
      
      onChanged();
      return getFilterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public com.github.marcoferrer.krotoplus.config.FileFilterOrBuilder getFilterOrBuilder() {
      if (filterBuilder_ != null) {
        return filterBuilder_.getMessageOrBuilder();
      } else {
        return filter_ == null ?
            com.github.marcoferrer.krotoplus.config.FileFilter.getDefaultInstance() : filter_;
      }
    }
    /**
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.marcoferrer.krotoplus.config.FileFilter, com.github.marcoferrer.krotoplus.config.FileFilter.Builder, com.github.marcoferrer.krotoplus.config.FileFilterOrBuilder> 
        getFilterFieldBuilder() {
      if (filterBuilder_ == null) {
        filterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.marcoferrer.krotoplus.config.FileFilter, com.github.marcoferrer.krotoplus.config.FileFilter.Builder, com.github.marcoferrer.krotoplus.config.FileFilterOrBuilder>(
                getFilter(),
                getParentForChildren(),
                isClean());
        filter_ = null;
      }
      return filterBuilder_;
    }

    private boolean unwrapBuilders_ ;
    /**
     * <pre>
     * By default the generated utility methods for building messages are
     * wrapped in an object similiar to a proto outer class. For better
     * ergonomics with code generated using 'java_multiple_files' the
     * builders can be unwrapped and generated at the root scope of
     * the output file.
     * </pre>
     *
     * <code>bool unwrap_builders = 2;</code>
     */
    public boolean getUnwrapBuilders() {
      return unwrapBuilders_;
    }
    /**
     * <pre>
     * By default the generated utility methods for building messages are
     * wrapped in an object similiar to a proto outer class. For better
     * ergonomics with code generated using 'java_multiple_files' the
     * builders can be unwrapped and generated at the root scope of
     * the output file.
     * </pre>
     *
     * <code>bool unwrap_builders = 2;</code>
     */
    public Builder setUnwrapBuilders(boolean value) {
      
      unwrapBuilders_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * By default the generated utility methods for building messages are
     * wrapped in an object similiar to a proto outer class. For better
     * ergonomics with code generated using 'java_multiple_files' the
     * builders can be unwrapped and generated at the root scope of
     * the output file.
     * </pre>
     *
     * <code>bool unwrap_builders = 2;</code>
     */
    public Builder clearUnwrapBuilders() {
      
      unwrapBuilders_ = false;
      onChanged();
      return this;
    }

    private boolean useDslMarkers_ ;
    /**
     * <pre>
     * Tag java builder classes with a kotlin interface annotated
     * with &#64;DslMarker. This requires the kroto-plus output directory to
     * match the generated java classes directory. Using &#64;DslMarker
     * provides safer and predictable dsl usage.
     * </pre>
     *
     * <code>bool use_dsl_markers = 3;</code>
     */
    public boolean getUseDslMarkers() {
      return useDslMarkers_;
    }
    /**
     * <pre>
     * Tag java builder classes with a kotlin interface annotated
     * with &#64;DslMarker. This requires the kroto-plus output directory to
     * match the generated java classes directory. Using &#64;DslMarker
     * provides safer and predictable dsl usage.
     * </pre>
     *
     * <code>bool use_dsl_markers = 3;</code>
     */
    public Builder setUseDslMarkers(boolean value) {
      
      useDslMarkers_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Tag java builder classes with a kotlin interface annotated
     * with &#64;DslMarker. This requires the kroto-plus output directory to
     * match the generated java classes directory. Using &#64;DslMarker
     * provides safer and predictable dsl usage.
     * </pre>
     *
     * <code>bool use_dsl_markers = 3;</code>
     */
    public Builder clearUseDslMarkers() {
      
      useDslMarkers_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:krotoplus.compiler.ProtoBuildersGenOptions)
  }

  // @@protoc_insertion_point(class_scope:krotoplus.compiler.ProtoBuildersGenOptions)
  private static final com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions();
  }

  public static com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProtoBuildersGenOptions>
      PARSER = new com.google.protobuf.AbstractParser<ProtoBuildersGenOptions>() {
    @java.lang.Override
    public ProtoBuildersGenOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProtoBuildersGenOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProtoBuildersGenOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProtoBuildersGenOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

