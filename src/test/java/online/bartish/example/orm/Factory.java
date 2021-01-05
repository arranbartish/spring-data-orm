package online.bartish.example.orm;

public interface Factory<TargetT> {
  TargetT getInstance();
}
