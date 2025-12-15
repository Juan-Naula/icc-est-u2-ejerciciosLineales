class SignValidator:
    def is_valid(self, text: str) -> bool:
        stack = []
        for char in text:
            if char == '(' or char == '{' or char == '[':
                stack.append(char)
            elif char == ')' or char == '}' or char == ']':
                if not stack:
                    return False
                ultimo = stack.pop()
                if not is_tipo_igual(char, ultimo):
                    return False

                
                
        return len(stack) == 0
    
    def is_tipo_igual(cierre, apertura):
        return (apertura == '(' and cierre == ')') or (apertura == '[' and cierre == ']') or (apertura == '{' and cierre == '}')