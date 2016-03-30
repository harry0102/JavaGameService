// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: loginRequest.proto

package org.tont.proto;

public final class LoginRequest {
  private LoginRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface LoginRequestEntityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.LoginRequestEntity)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 pid = 1;</code>
     */
    int getPid();

    /**
     * <code>optional string account = 2;</code>
     */
    java.lang.String getAccount();
    /**
     * <code>optional string account = 2;</code>
     */
    com.google.protobuf.ByteString
        getAccountBytes();

    /**
     * <code>optional string password = 3;</code>
     */
    java.lang.String getPassword();
    /**
     * <code>optional string password = 3;</code>
     */
    com.google.protobuf.ByteString
        getPasswordBytes();

    /**
     * <code>optional string deviceid = 4;</code>
     */
    java.lang.String getDeviceid();
    /**
     * <code>optional string deviceid = 4;</code>
     */
    com.google.protobuf.ByteString
        getDeviceidBytes();
  }
  /**
   * Protobuf type {@code proto.LoginRequestEntity}
   *
   * <pre>
   * [START messages code 100]
   * </pre>
   */
  public  static final class LoginRequestEntity extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:proto.LoginRequestEntity)
      LoginRequestEntityOrBuilder {
    // Use LoginRequestEntity.newBuilder() to construct.
    private LoginRequestEntity(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private LoginRequestEntity() {
      pid_ = 0;
      account_ = "";
      password_ = "";
      deviceid_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private LoginRequestEntity(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              pid_ = input.readInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              account_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              password_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              deviceid_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tont.proto.LoginRequest.internal_static_proto_LoginRequestEntity_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tont.proto.LoginRequest.internal_static_proto_LoginRequestEntity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tont.proto.LoginRequest.LoginRequestEntity.class, org.tont.proto.LoginRequest.LoginRequestEntity.Builder.class);
    }

    public static final int PID_FIELD_NUMBER = 1;
    private int pid_;
    /**
     * <code>optional int32 pid = 1;</code>
     */
    public int getPid() {
      return pid_;
    }

    public static final int ACCOUNT_FIELD_NUMBER = 2;
    private volatile java.lang.Object account_;
    /**
     * <code>optional string account = 2;</code>
     */
    public java.lang.String getAccount() {
      java.lang.Object ref = account_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        account_ = s;
        return s;
      }
    }
    /**
     * <code>optional string account = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAccountBytes() {
      java.lang.Object ref = account_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        account_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PASSWORD_FIELD_NUMBER = 3;
    private volatile java.lang.Object password_;
    /**
     * <code>optional string password = 3;</code>
     */
    public java.lang.String getPassword() {
      java.lang.Object ref = password_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        password_ = s;
        return s;
      }
    }
    /**
     * <code>optional string password = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DEVICEID_FIELD_NUMBER = 4;
    private volatile java.lang.Object deviceid_;
    /**
     * <code>optional string deviceid = 4;</code>
     */
    public java.lang.String getDeviceid() {
      java.lang.Object ref = deviceid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceid_ = s;
        return s;
      }
    }
    /**
     * <code>optional string deviceid = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDeviceidBytes() {
      java.lang.Object ref = deviceid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (pid_ != 0) {
        output.writeInt32(1, pid_);
      }
      if (!getAccountBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, account_);
      }
      if (!getPasswordBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 3, password_);
      }
      if (!getDeviceidBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 4, deviceid_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, pid_);
      }
      if (!getAccountBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, account_);
      }
      if (!getPasswordBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(3, password_);
      }
      if (!getDeviceidBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(4, deviceid_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static org.tont.proto.LoginRequest.LoginRequestEntity parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tont.proto.LoginRequest.LoginRequestEntity parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tont.proto.LoginRequest.LoginRequestEntity parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tont.proto.LoginRequest.LoginRequestEntity parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tont.proto.LoginRequest.LoginRequestEntity parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.tont.proto.LoginRequest.LoginRequestEntity parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.tont.proto.LoginRequest.LoginRequestEntity parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.tont.proto.LoginRequest.LoginRequestEntity parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.tont.proto.LoginRequest.LoginRequestEntity parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.tont.proto.LoginRequest.LoginRequestEntity parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tont.proto.LoginRequest.LoginRequestEntity prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code proto.LoginRequestEntity}
     *
     * <pre>
     * [START messages code 100]
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.LoginRequestEntity)
        org.tont.proto.LoginRequest.LoginRequestEntityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tont.proto.LoginRequest.internal_static_proto_LoginRequestEntity_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tont.proto.LoginRequest.internal_static_proto_LoginRequestEntity_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tont.proto.LoginRequest.LoginRequestEntity.class, org.tont.proto.LoginRequest.LoginRequestEntity.Builder.class);
      }

      // Construct using org.tont.proto.LoginRequest.LoginRequestEntity.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        pid_ = 0;

        account_ = "";

        password_ = "";

        deviceid_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tont.proto.LoginRequest.internal_static_proto_LoginRequestEntity_descriptor;
      }

      public org.tont.proto.LoginRequest.LoginRequestEntity getDefaultInstanceForType() {
        return org.tont.proto.LoginRequest.LoginRequestEntity.getDefaultInstance();
      }

      public org.tont.proto.LoginRequest.LoginRequestEntity build() {
        org.tont.proto.LoginRequest.LoginRequestEntity result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.tont.proto.LoginRequest.LoginRequestEntity buildPartial() {
        org.tont.proto.LoginRequest.LoginRequestEntity result = new org.tont.proto.LoginRequest.LoginRequestEntity(this);
        result.pid_ = pid_;
        result.account_ = account_;
        result.password_ = password_;
        result.deviceid_ = deviceid_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tont.proto.LoginRequest.LoginRequestEntity) {
          return mergeFrom((org.tont.proto.LoginRequest.LoginRequestEntity)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tont.proto.LoginRequest.LoginRequestEntity other) {
        if (other == org.tont.proto.LoginRequest.LoginRequestEntity.getDefaultInstance()) return this;
        if (other.getPid() != 0) {
          setPid(other.getPid());
        }
        if (!other.getAccount().isEmpty()) {
          account_ = other.account_;
          onChanged();
        }
        if (!other.getPassword().isEmpty()) {
          password_ = other.password_;
          onChanged();
        }
        if (!other.getDeviceid().isEmpty()) {
          deviceid_ = other.deviceid_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.tont.proto.LoginRequest.LoginRequestEntity parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tont.proto.LoginRequest.LoginRequestEntity) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int pid_ ;
      /**
       * <code>optional int32 pid = 1;</code>
       */
      public int getPid() {
        return pid_;
      }
      /**
       * <code>optional int32 pid = 1;</code>
       */
      public Builder setPid(int value) {
        
        pid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 pid = 1;</code>
       */
      public Builder clearPid() {
        
        pid_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object account_ = "";
      /**
       * <code>optional string account = 2;</code>
       */
      public java.lang.String getAccount() {
        java.lang.Object ref = account_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          account_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string account = 2;</code>
       */
      public com.google.protobuf.ByteString
          getAccountBytes() {
        java.lang.Object ref = account_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          account_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string account = 2;</code>
       */
      public Builder setAccount(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        account_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string account = 2;</code>
       */
      public Builder clearAccount() {
        
        account_ = getDefaultInstance().getAccount();
        onChanged();
        return this;
      }
      /**
       * <code>optional string account = 2;</code>
       */
      public Builder setAccountBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        account_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object password_ = "";
      /**
       * <code>optional string password = 3;</code>
       */
      public java.lang.String getPassword() {
        java.lang.Object ref = password_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          password_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string password = 3;</code>
       */
      public com.google.protobuf.ByteString
          getPasswordBytes() {
        java.lang.Object ref = password_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          password_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string password = 3;</code>
       */
      public Builder setPassword(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        password_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string password = 3;</code>
       */
      public Builder clearPassword() {
        
        password_ = getDefaultInstance().getPassword();
        onChanged();
        return this;
      }
      /**
       * <code>optional string password = 3;</code>
       */
      public Builder setPasswordBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        password_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object deviceid_ = "";
      /**
       * <code>optional string deviceid = 4;</code>
       */
      public java.lang.String getDeviceid() {
        java.lang.Object ref = deviceid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          deviceid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string deviceid = 4;</code>
       */
      public com.google.protobuf.ByteString
          getDeviceidBytes() {
        java.lang.Object ref = deviceid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          deviceid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string deviceid = 4;</code>
       */
      public Builder setDeviceid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        deviceid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string deviceid = 4;</code>
       */
      public Builder clearDeviceid() {
        
        deviceid_ = getDefaultInstance().getDeviceid();
        onChanged();
        return this;
      }
      /**
       * <code>optional string deviceid = 4;</code>
       */
      public Builder setDeviceidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        deviceid_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:proto.LoginRequestEntity)
    }

    // @@protoc_insertion_point(class_scope:proto.LoginRequestEntity)
    private static final org.tont.proto.LoginRequest.LoginRequestEntity DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tont.proto.LoginRequest.LoginRequestEntity();
    }

    public static org.tont.proto.LoginRequest.LoginRequestEntity getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LoginRequestEntity>
        PARSER = new com.google.protobuf.AbstractParser<LoginRequestEntity>() {
      public LoginRequestEntity parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new LoginRequestEntity(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<LoginRequestEntity> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LoginRequestEntity> getParserForType() {
      return PARSER;
    }

    public org.tont.proto.LoginRequest.LoginRequestEntity getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_LoginRequestEntity_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_LoginRequestEntity_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022loginRequest.proto\022\005proto\"V\n\022LoginRequ" +
      "estEntity\022\013\n\003pid\030\001 \001(\005\022\017\n\007account\030\002 \001(\t\022" +
      "\020\n\010password\030\003 \001(\t\022\020\n\010deviceid\030\004 \001(\tBB\n\016o" +
      "rg.tont.protoB\014LoginRequest\252\002!Google.Pro" +
      "tobuf.ToNT.LoginRequestb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_proto_LoginRequestEntity_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_LoginRequestEntity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_proto_LoginRequestEntity_descriptor,
        new java.lang.String[] { "Pid", "Account", "Password", "Deviceid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}