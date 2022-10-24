import axios from "../api/axios";

export const addTwoNumber = async (firstNumber, secondNumber) => {
  return axios.get(`/additionne?fn=${firstNumber}&sn=${secondNumber}`);
};
