package com.app.generated.graphql;

import com.apollographql.apollo.api.Mutation;
import java.lang.String;
import java.lang.Override;
import javax.annotation.Generated;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.internal.Utils;
import type.CreateTodoInput;
import com.apollographql.apollo.api.ResponseField;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import java.util.Collections;
import type.CustomType;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.Map;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import java.io.IOException;

@Generated("Apollo GraphQL")
public final class CreateTodoMutation implements Mutation<CreateTodoMutation.Data, CreateTodoMutation.Data, CreateTodoMutation.Variables> {
  public static final String OPERATION_DEFINITION = "mutation CreateTodo($input: CreateTodoInput!) {   createTodo(input: $input) {     id     name     description   } }";
  public static final String QUERY_DOCUMENT = OPERATION_DEFINITION;
  public static final OperationName OPERATION_NAME = new OperationName() {
    @Override
    public String name() {
      return "CreateTodo";
    }
  };
  private final CreateTodoMutation.Variables variables;
  @Override
   public String queryDocument() {
    return QUERY_DOCUMENT;
  }
  
  @Override
   public CreateTodoMutation.Data wrapData(CreateTodoMutation.Data data) {
    return data;
  }
  
  @Override
   public CreateTodoMutation.Variables variables() {
    return variables;
  }
  
  @Override
   public ResponseFieldMapper<CreateTodoMutation.Data> responseFieldMapper() {
    return new Data.Mapper();
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  @Override
   public OperationName name() {
    return OPERATION_NAME;
  }
  
  public String operationId() {
    return "ccf21c7837e09882049484de7ae1a14b";
  }
  
  public CreateTodoMutation(CreateTodoInput input) {
    Utils.checkNotNull(input, "input == null");
    this.variables = new CreateTodoMutation.Variables(input);
  }
  public static class Data implements Operation.Data {
    private final @Nullable CreateTodo createTodo;
    private volatile String $toString;
    private volatile int $hashCode;
    private volatile boolean $hashCodeMemoized;
    static final ResponseField[] $responseFields = {
        ResponseField.forObject("createTodo", "createTodo", new UnmodifiableMapBuilder<String, Object>(1).put("input", new UnmodifiableMapBuilder<String, Object>(2).put("kind", "Variable").put("variableName", "input").build()).build(), true, Collections.<ResponseField.Condition>emptyList())
      };
    public Data(@Nullable CreateTodo createTodo) {
      this.createTodo = createTodo;
    }
    
    public @Nullable CreateTodo createTodo() {
      return this.createTodo;
    }
    
    @Override
     public String toString() {
      if ($toString == null) {
        $toString = "Data{"
          + "createTodo=" + createTodo + ", "
          + "}";
      }
      
      return $toString;
    }
    
    @Override
     public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof Data) {
        Data that = (Data) o;
        return ((this.createTodo == null) ? (that.createTodo == null) : this.createTodo.equals(that.createTodo));
      }
      
      return false;
    }
    
    @Override
     public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= (createTodo == null) ? 0 : createTodo.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      
      return $hashCode;
    }
    
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeObject($responseFields[0], createTodo != null ? createTodo.marshaller() : null);
        }
      };
    }
    public static final class Mapper implements ResponseFieldMapper<Data> {
      private final CreateTodo.Mapper createTodoFieldMapper = new CreateTodo.Mapper();
      @Override
       public Data map(ResponseReader reader) {
        final CreateTodo createTodo = reader.readObject($responseFields[0], new ResponseReader.ObjectReader<CreateTodo>() {
                  @Override
                  public CreateTodo read(ResponseReader reader) {
                    return createTodoFieldMapper.map(reader);
                  }
                });
        return new Data(createTodo);
      }
    }
    
  }
  

  public static class CreateTodo {
    private final @Nonnull String __typename;
    private final @Nonnull String id;
    private final @Nonnull String name;
    private final @Nullable String description;
    private volatile String $toString;
    private volatile int $hashCode;
    private volatile boolean $hashCodeMemoized;
    static final ResponseField[] $responseFields = {
        ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
        ResponseField.forCustomType("id", "id", null, false, CustomType.ID, Collections.<ResponseField.Condition>emptyList()),
        ResponseField.forString("name", "name", null, false, Collections.<ResponseField.Condition>emptyList()),
        ResponseField.forString("description", "description", null, true, Collections.<ResponseField.Condition>emptyList())
      };
    public CreateTodo(@Nonnull String __typename, @Nonnull String id, @Nonnull String name, @Nullable String description) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.id = Utils.checkNotNull(id, "id == null");
      this.name = Utils.checkNotNull(name, "name == null");
      this.description = description;
    }
    
    public @Nonnull String __typename() {
      return this.__typename;
    }
    
    public @Nonnull String id() {
      return this.id;
    }
    
    public @Nonnull String name() {
      return this.name;
    }
    
    public @Nullable String description() {
      return this.description;
    }
    
    @Override
     public String toString() {
      if ($toString == null) {
        $toString = "CreateTodo{"
          + "__typename=" + __typename + ", "
          + "id=" + id + ", "
          + "name=" + name + ", "
          + "description=" + description + ", "
          + "}";
      }
      
      return $toString;
    }
    
    @Override
     public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof CreateTodo) {
        CreateTodo that = (CreateTodo) o;
        return this.__typename.equals(that.__typename) && this.id.equals(that.id) && this.name.equals(that.name) && ((this.description == null) ? (that.description == null) : this.description.equals(that.description));
      }
      
      return false;
    }
    
    @Override
     public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= __typename.hashCode();
        h *= 1000003;
        h ^= id.hashCode();
        h *= 1000003;
        h ^= name.hashCode();
        h *= 1000003;
        h ^= (description == null) ? 0 : description.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      
      return $hashCode;
    }
    
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeCustom((ResponseField.CustomTypeField) $responseFields[1], id);
          writer.writeString($responseFields[2], name);
          writer.writeString($responseFields[3], description != null ? description : null);
        }
      };
    }
    public static final class Mapper implements ResponseFieldMapper<CreateTodo> {
      @Override
       public CreateTodo map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final String id = reader.readCustomType((ResponseField.CustomTypeField) $responseFields[1]);
        final String name = reader.readString($responseFields[2]);
        final String description = reader.readString($responseFields[3]);
        return new CreateTodo(__typename, id, name, description);
      }
    }
    
  }
  

  public static final class Builder {
    private @Nullable CreateTodoInput input;
    Builder() {
      
    }
    
    public Builder input(@Nullable CreateTodoInput input) {
      this.input = input;
      return this;
    }
    
    public CreateTodoMutation build() {
      return new CreateTodoMutation(input);
    }
  }
  

  public static final class Variables extends Operation.Variables {
    private @Nonnull CreateTodoInput input;
    private final transient Map<String, Object> valueMap = new LinkedHashMap<>();
    public CreateTodoInput input() {
      return input;
    }
    
    public Variables(@Nonnull CreateTodoInput input) {
      this.input = input;
      this.valueMap.put("input", input);
    }
    
    @Override
     public Map<String, Object> valueMap() {
      return Collections.unmodifiableMap(valueMap);
    }
    
    @Override
     public InputFieldMarshaller marshaller() {
      return new InputFieldMarshaller() {
        @Override
        public void marshal(InputFieldWriter writer) throws IOException {
          writer.writeObject("input", input != null ? input.marshaller() : null);
        }
      };
    }
  }
  
}
