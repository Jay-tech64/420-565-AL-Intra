import { fireEvent, render, screen } from "@testing-library/react";
import App from "./App";

describe("App", () => {
  it("should render inputs", () => {
    render(<App />);

    const addInputOne = screen.getByPlaceholderText(/One/i);
    const addInputTwo = screen.getByPlaceholderText(/Two/i);

    expect(addInputOne).toBeInTheDocument();
    expect(addInputTwo).toBeInTheDocument();
  });

  it("should add text to input", () => {
    render(<App />);

    const addInputOne = screen.getByPlaceholderText(/One/i);
    const addInputTwo = screen.getByPlaceholderText(/Two/i);
    fireEvent.change(addInputOne, { target: { value: "12" } });
    fireEvent.change(addInputTwo, { target: { value: "4" } });

    expect(addInputOne.value).toBe("12");
    expect(addInputTwo.value).toBe("4");
  });
});
