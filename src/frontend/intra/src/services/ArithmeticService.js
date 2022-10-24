import axios from "../api/axios";

export const addTwoNumber = async (firstNumber, secondNumber) => {
  return axios.get(`/additionne/${firstNumber}/${secondNumber}`);
};
