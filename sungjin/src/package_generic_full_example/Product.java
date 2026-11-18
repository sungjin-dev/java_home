package package_generic_full_example;

public class Product<T,M> {
        private T kind;
        private M model;

        public T getKind() {
            return this.kind;
        }
        public M getModel() {
            return this.model;
        }
        public void setKind(T kind) {
            this.kind = kind;
        }
        public void setKind(M model) {
            this.model = model;
        }
}
