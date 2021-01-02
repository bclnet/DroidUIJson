# DroidUIJson

A Json representation of DroidUI enabling runtime defined views

## Example

JsonPreview will provide json output with a before, and after representation.

```java
import com.DroidUI;

class SampleView implements View {
    View getBody() { return
        new VStack(() ->
            new Text("Hello World");
        )
        .padding();
    }
}

class SampleView_Previews implements PreviewProvider {
    static View getPreviews() { returns
        new JsonPreview(() ->
            new SampleView();
        );
    }
}
```

## References

The extension method `var` will let DroidUIJson know this is intended to be a variable.

```java
new VStack(() ->
    new Text("Title Here".var(self));
)
```
